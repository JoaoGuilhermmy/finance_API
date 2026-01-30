package com.joaoguilhermmy.finance.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.joaoguilhermmy.finance.entities.Expense;
import com.joaoguilhermmy.finance.entities.User;
import com.joaoguilhermmy.finance.services.ExpenseService;
import com.joaoguilhermmy.finance.services.UserService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/users")
@Tag(name = "User Management", description = "Endpoints for managing users")
public class UserResource {

    @Autowired
    private UserService service;

    @Autowired
    private ExpenseService expenseService;

    @Operation(summary = "Find all users", description = "Retrieves a list of all registered users")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Operation successful"),
            @ApiResponse(responseCode = "500", description = "Internal server error"),
    })
    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @Operation(summary = "Find user by id", description = "Retrieves a user by the id that was passed.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Operation successful"),
            @ApiResponse(responseCode = "404", description = "User not found"),
    })
    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Integer id) {
        User user = service.findById(id);
        return ResponseEntity.ok().body(user);
    }

    @Operation(summary = "Delete a user", description = "Deletes a user by their unique identifier.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "204", description = "User deleted successfully"),
            @ApiResponse(responseCode = "404", description = "User not found"),
            @ApiResponse(responseCode = "500", description = "Internal server error (Integrity violation)")
    })
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @Operation(summary = "Create a new user", description = "Creates a new user in the database and returns the created object with its id.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "User created")
    })
    @PostMapping
    public ResponseEntity<User> insert(@RequestBody User obj) {
        obj = service.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).body(obj);
    }

    @Operation(summary = "Update user", description = "Updates data for an existing user.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "User Updated successfully"),
            @ApiResponse(responseCode = "404", description = "User not found"),
    })
    @PutMapping(value = "/{id}")
    public ResponseEntity<User> update(@PathVariable Integer id, @RequestBody User user) {
        user = service.update(id, user);
        return ResponseEntity.ok().body(user);
    }

    @Operation(summary = "Get user expenses", description = "Returns all expenses for a given user by their id.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Operation successful"),
            @ApiResponse(responseCode = "404", description = "User not found"),
    })
    @GetMapping(value = "/{id}/expenses")
    public ResponseEntity<List<Expense>> findExpensesByUser(@PathVariable Integer id) {
        List<Expense> list = expenseService.findByUser(id);
        return ResponseEntity.ok().body(list);
    }
}
