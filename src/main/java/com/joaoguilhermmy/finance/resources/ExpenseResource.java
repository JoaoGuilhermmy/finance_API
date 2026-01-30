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
import com.joaoguilhermmy.finance.services.ExpenseService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/expenses")
@Tag(name = "Expense Management", description = "Endpoints for managing expenses")
public class ExpenseResource {

    @Autowired
    private ExpenseService service;

    @Operation(summary = "Find all expenses", description = "Retrieves a list of all registered expenses.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Operation successful"),
            @ApiResponse(responseCode = "500", description = "Internal server error"),
    })
    @GetMapping
    public ResponseEntity<List<Expense>> findAll() {
        List<Expense> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @Operation(summary = "Find expense by id", description = "Retrieves an expense by its id.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Operation successful"),
            @ApiResponse(responseCode = "404", description = "Expense not found"),
    })
    @GetMapping(value = "/{id}")
    public ResponseEntity<Expense> findById(@PathVariable Integer id) {
        Expense obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @Operation(summary = "Create a new expense", description = "Creates a new expense in the database and returns the created object with its id.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Expense created")
    })
    @PostMapping
    public ResponseEntity<Expense> insert(@RequestBody Expense obj) {
        obj = service.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).body(obj);
    }

    @Operation(summary = "Delete an expense", description = "Deletes an expense by their unique identifier")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "204", description = "Expense deleted successfully"),
            @ApiResponse(responseCode = "404", description = "Expense not found"),
            @ApiResponse(responseCode = "500", description = "Internal server error (Integrity violation)")
    })
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @Operation(summary = "Update expense", description = "Updates an existing expense record.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Expense Updated successfully"),
            @ApiResponse(responseCode = "404", description = "Expense not found"),
    })
    @PutMapping(value = "/{id}")
    public ResponseEntity<Expense> update(@PathVariable Integer id, @RequestBody Expense expense) {
        expense = service.update(id, expense);
        return ResponseEntity.ok().body(expense);
    }

}
