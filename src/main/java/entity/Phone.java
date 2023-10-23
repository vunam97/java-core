package entity;

public class Phone<K, V> extends MyMap {
    private K key;
    private V phoneNumber;

    public Phone(Object key, Object value) {
        super(key, value);
    }

    @Override
    public K getKey() {
        return key;
    }

    public V getPhoneNumber() {
        return phoneNumber;
    }
}
