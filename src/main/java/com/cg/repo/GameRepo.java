/*package com.cg.repo;

import com.cg.bean.Game;

public interface GameRepo {
	
	public Game save(Game g);
	public Game findByName(String name);

}*/
package com.cg.repo;

import com.cg.bean.Game;

//import com.cg.repo;

public interface GameRepo {
	
	public  boolean  save(Game game);
	public Game findByName(String name);
}