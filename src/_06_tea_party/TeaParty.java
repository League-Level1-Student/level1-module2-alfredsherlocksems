package _06_tea_party;

import javax.swing.JOptionPane;

public class TeaParty {
	public String welcome(String name, boolean isWoman, boolean isKnighted) {
        if (isWoman && isKnighted) {
        	return "Greetings, Lady " + name + ".";
        }
        else if (isWoman && !isKnighted) {
        	return "Greetings, Ms. " + name + ".";
        }
        else if (!isWoman && isKnighted) {
        	return "Greetings, Sir " + name + ".";
        }
        else if (!isWoman && !isKnighted) {
        	return "Greetings, Mr. " + name + ".";
        }
        return "";
    }
}

