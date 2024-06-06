package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.model.Stock;

@Service
public class StockService {
	List<Stock> names=new ArrayList();
	public StockService()
	{
		Stock st1=new Stock(1,"TataPower","Tata power ltd");
		Stock st2=new Stock(2,"Misthan","Misthan");
		names.add(st1);names.add(st2);
	}
	public List<Stock> read()
	{
		return names;
	}
	public Stock readOne(int idd)
	{
		for(int i=0;i<names.size();i++)
		{
			if(names.get(i).getId()==idd)
			{
				return names.get(i);
			}
		}
		return null;
	}
	public void add(Stock stNew)
	{
		names.add(stNew);
	}
	public Stock update( int id,Stock stockNew)
	{
		for(int i=0;i<names.size();i++)
		{
			Stock stockOld=names.get(i);
			if(stockOld.getId()==id)
			{
				stockOld.setId(stockNew.getId());
				stockOld.setTicker(stockNew.getTicker());
				stockOld.setOrg(stockNew.getOrg());
				return stockOld;
			}
		}
		return null;
	}
	public void delete(@PathVariable int id)
	{
		for(int i=0;i<names.size();i++)
		{
			if(names.get(i).getId()==id)
			{
				names.remove(i);
			}
		}
		
	}

}

