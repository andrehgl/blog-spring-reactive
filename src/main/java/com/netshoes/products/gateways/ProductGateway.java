package com.netshoes.products.gateways;

import com.netshoes.products.domains.Product;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductGateway {

  Mono<Product> save(Product product);

  Mono<Product> findByCode(String code);

  Mono<Void> deleteByCode(String code);

  Flux<Product> findAll();

}
