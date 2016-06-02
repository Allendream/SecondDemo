package dao;

import java.util.List;

import entity.Guitar;


public interface GuitarDao {

public List<Guitar> queryAllguitar();
public Guitar querybyNumber(String serialNumber);
}
