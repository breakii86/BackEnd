package org.twg.backend.Controller;

import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * This is a basic interface to provide methods, that have to be implemented in all model controller
 * All methods need an futher implementation with the @Mapping Operator, to be accessible.
 * @author Florian determann
 * @param <T>
 */
public interface Controller<T> {

    /**
     *
     * @return List of all Objects of Type T
     * @Mapping GetMapping
     */
    List<T> getAll();

    /**
     * This lets you create an entity of an object
     * @param t Object to be modified
     * @return HTTP_Code, to provide Info to Client
     * @Mapping PostMapping
     */
    ResponseEntity create(T t);

    /**
     * This method lets you update an entity of an Object
     * @param t Object to be modified
     * @return HTTP_Code, to provide Info to Client
     * @Mapping PutMapping
     */
    ResponseEntity update(T t);

    /**
     * This method lets you delete an Object
     * @param t Object to be deleted
     * @return HTTP_Code, to provide Info to Client
     * @Mapping DeleteMapping
     */
    ResponseEntity delete(T t);
}
