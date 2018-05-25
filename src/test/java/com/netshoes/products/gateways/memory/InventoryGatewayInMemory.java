package com.netshoes.products.gateways.memory;

import com.netshoes.products.gateways.InventoryGateway;
import java.util.HashMap;
import java.util.Map;
import reactor.core.publisher.Mono;

public class InventoryGatewayInMemory implements InventoryGateway {

  private Map<String, Long> inventory = new HashMap<>();

  public void addAvailability(final String productCode, Long quantity) {
    this.inventory.put(productCode, quantity);
  }

  @Override
  public Mono<Long> getAvailability(final String productCode) {
    return Mono.just(inventory.getOrDefault(productCode, 0l));
  }

}
