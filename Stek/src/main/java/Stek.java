/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 * @param <T>
 */
public interface Stek<T> {

    /**
     *
     * @param value
     */
    void push(T value);

    /**
     *
     * @return
     */
    T pop();

    /**
     *
     */
    void trimToSize();

}
