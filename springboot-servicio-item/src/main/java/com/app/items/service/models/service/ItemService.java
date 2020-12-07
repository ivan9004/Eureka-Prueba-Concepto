package com.app.items.service.models.service;

import java.util.List;

import com.app.items.service.models.Item;

public interface ItemService {

	public List<Item> findAll();
	public Item findById(Long id, Integer cantidad);
}
