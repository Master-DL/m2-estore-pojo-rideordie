package core.services;

import estorePojo.exceptions.UnknownItemException;

public interface IProvider {
    public double getPrice(Object item) throws UnknownItemException;

    public int order(Store store, Object item, int qty) throws UnknownItemException;
}
