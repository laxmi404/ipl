package com.wecp.progressive.service.impl;
 
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
 
import com.wecp.progressive.entity.Cricketer;
import com.wecp.progressive.service.CricketerService;
 
public class CricketerServiceImplJdbc implements CricketerService {
    private List<Cricketer> cricketers;
    public CricketerServiceImplJdbc()
    {
        this.cricketers = new ArrayList<>();
    }
 
    @Override
    public List<Cricketer> getAllCricketers() {
        return new ArrayList<>(cricketers);
       
       
    }
 
    @Override
    public Integer addCricketer(Cricketer cricketer) {
        cricketers.add(cricketer);
        return cricketers.size();
       
       
    }
 
    @Override
    public List<Cricketer> getAllCricketersSortedByExperience() {
        List<Cricketer> sortedCricketers = new ArrayList<>(cricketers);
        Collections.sort(sortedCricketers);
        return sortedCricketers;
       
    }
    @Override
    public void emptyArrayList() {
        this.cricketers = new ArrayList<>(); }
 
}
 
 