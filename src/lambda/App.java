package lambda;

public class App {

	public static void main(String[] args) {
		
		String cep = "99999-999";
		
		Validator<String> checkCep = item->item.matches("[0-9]{5}-[0-9]{3}");
		
		System.out.print(checkCep.check(cep));

	}

}
