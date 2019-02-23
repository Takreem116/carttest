package roaahw1;

import java.util.ArrayList;


public class Cart {
	ArrayList<Pro> r=new ArrayList();

	public int getCou() {
		// TODO Auto-generated method stub
		int sum=0;
			for (int i =0;i<r.size();i++){
			sum+=r.get(i).qun;}
		return sum;	}

	public void add(Pro p) {
		// TODO Auto-generated method stub
		r.add(p);
	}

	public int getPri() {
		// TODO Auto-generated method stub
		int sum=0;int R;
		for (int i =0;i<r.size();i++) {
			R=r.get(i).pri *r.get(i).qun;
			sum=sum+R;}
		return sum;}
	}

