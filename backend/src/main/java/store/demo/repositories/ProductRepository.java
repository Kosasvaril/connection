package store.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import store.demo.entities.Products;

@Repository
public interface ProductRepository extends JpaRepository<Products, Long> {
}
