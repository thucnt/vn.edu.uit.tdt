package org.neo4j.example.northwind.repository;

import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;
import org.neo4j.example.northwind.model.Supplier;

/**
 * Repository interface for suppliers.
 *
 * @author Axel Morgner
 */
@Repository
public interface SupplierRepository extends GraphRepository<Supplier> {}
