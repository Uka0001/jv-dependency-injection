package mate.academy.service;

import java.util.List;

import mate.academy.lib.Inject;
import mate.academy.model.Product;

public interface ProductService {
    List<Product> getAllFromFile(String filePath);
}
