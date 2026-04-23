package cl.duoc.productos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.duoc.productos.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
