package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	private Object[] items;
	private int size;


	public CustomArrayList() {
		items = new Object[10];
		size = 0;
	}

	@Override
	public boolean add(T item) {

		if (size == items.length) {
			resizeArray();
		}
		items[size] = item;
		size++;
		return true;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public T get(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
		}
		return (T) items[index];
	}


	private void resizeArray() {
		items = Arrays.copyOf(items, items.length * 2);

	}
}