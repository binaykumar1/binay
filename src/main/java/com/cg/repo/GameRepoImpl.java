/*package com.cg.repo;

import java.util.Set;

import com.cg.bean.Game;

public class GameRepoImpl implements GameRepo {

	private Set<Game> games;
	
	@Override
	public Game save(Game g) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Game findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
*/
package com.cg.repo;

import java.util.Set;

import com.cg.bean.Game;

public class GameRepoImpl implements GameRepo {

	private Set<Game> games;

	public boolean save(Game game) {
		// TODO Auto-generated method stub
		return true ;
	}

	public Game findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
}