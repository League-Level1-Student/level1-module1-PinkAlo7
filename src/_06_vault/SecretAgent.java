package _06_vault;

public class SecretAgent {

	int findCode(Vault treasureHolder) {
    for(int i=0; i<=1000000;i++) {
    	if(treasureHolder.tryCode(i)) {
    		return i;
    	}
   
    }
    return -1;
    
 
}
}
