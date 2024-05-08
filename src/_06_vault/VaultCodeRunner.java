package _06_vault;

public class VaultCodeRunner {
public static void main(String[] args) {
	Vault object = new Vault();
	SecretAgent hannah = new SecretAgent();
	System.out.println(hannah.findCode(object));
}
}
