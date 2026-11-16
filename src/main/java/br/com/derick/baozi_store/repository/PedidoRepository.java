package br.com.derick.baozi_store.repository;

import br.com.derick.baozi_store.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
