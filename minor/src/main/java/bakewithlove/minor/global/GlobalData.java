package bakewithlove.minor.global;

import java.util.ArrayList;
import java.util.List;

import bakewithlove.minor.model.Product;

public class GlobalData {
    public static List<Product> cart;
    static
    {
        cart = new ArrayList<Product>();
    }
}
