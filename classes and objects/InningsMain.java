package com.ltts;

public class InningsMain {
	public static void main(String[] args) {
		Innings i=new Innings();
		i.setTeamname("india");
		i.setInningsname("first");
        i.setRuns(200);
        if(i.getRuns()<0)
        {
        	System.out.println("invalid input");
        	System.exit(0);
        }
        System.out.println("Name:"+i.getTeamname());
        System.out.println("Scored:"+i.getRuns());
        if("first"==i.getInningsname())
        {
        	System.out.println("Need 201 to Win ");
        }
        else if("second"==i.getInningsname())
        {
        	System.out.println("Match Ended");
        }
	}
}


