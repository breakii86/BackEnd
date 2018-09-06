package org.twg.backend.Dao;

import java.util.List;

/**
 * @author Florian Determann
 * @param <T> Object
 *
 * This interface presents an basic set of methods, which must be included in every DAO-Model
 */
public interface Dao<T> {

    /**
     * Thsi method lets you get all Objects in the data scheme.
     * @return all availebale Objects / Entities.
     */
    List<T> getAll();

    /**
     * @see edu.hslingen.bajournal.backend.controller.Controller
     * Pretty similiar to it.
     * @param t
     */
    void save(T t);
    void update(T t, String[] params);
    void delete(T t);
}
