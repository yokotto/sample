package model;

import model.Hero;
import model.Monster;
import java.util.List;
//UΜ\bh
public class ItemLogic extends Skill{
	public Hero heroItemLogic(Hero hero, Monster monster, int itemNo){		
		
		ItemGetParameter igp= new ItemGetParameter();			

		Item item = igp.getParameter(itemNo);
		
		//hp,mp,atkΜΟ»
		if(item.getEffect().equals("hp")){
			hero.setHp(hero.getHp() + item.getEffectSize());
		} else if(item.getEffect().equals("mp")){
			hero.setMp(hero.getMp() + item.getEffectSize());
		} else if(item.getEffect().equals("atk")){
			hero.setAtk(hero.getAtk() + item.getEffectSize());
		}
		//Xe[^XΜρ
		if(item.getStatusEffect().equals("Ε") && hero.getStatus().equals("Ε")){
			hero.setStatus("½ν");
		} else if(item.getStatusEffect().equals("Ξ") && hero.getStatus().equals("Ξ")){
			hero.setStatus("½ν");
		} else if(item.getStatusEffect().equals("γ") && hero.getStatus().equals("γ")){
			hero.setStatus("½ν");
		}
	return hero;
	}

	public Monster monsterItemLogic(Hero hero, Monster monster, int itemNo){

		ItemGetParameter igp= new ItemGetParameter();			

		Item item = igp.getParameter(itemNo);

		//hp,mp,atkΜΟ»
		if(item.getEffect().equals("hp")){
			monster.setHp(monster.getHp() + item.getEffectSize());
		} else if(item.getEffect().equals("mp")){
			monster.setMp(monster.getMp() + item.getEffectSize());
		} else if(item.getEffect().equals("atk")){
			monster.setAtk(monster.getAtk() + item.getEffectSize());
		}
		//Xe[^XΜρ
		if(item.getStatusEffect().equals("Ε") && monster.getStatus().equals("Ε")){
			monster.setStatus("½ν");
		} else if(item.getStatusEffect().equals("Ξ") && monster.getStatus().equals("Ξ")){
			monster.setStatus("½ν");
		} else if(item.getStatusEffect().equals("γ") && monster.getStatus().equals("γ")){
			monster.setStatus("½ν");
		}
	return monster;
	}
}