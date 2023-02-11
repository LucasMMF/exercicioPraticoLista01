package principal;

import java.io.PrintWriter;
import entities.Funcionario;

public class Program {
	
	public static void main(String[] args) {
		
		System.out.println("\n *** CADASTRO DE FUNCIONARIOS *** \n");
		
		Funcionario funcionario = new Funcionario();
		
		funcionario.setIdFuncionario(1);
		funcionario.setNome("Lucas Mateus");
		funcionario.setCpf("043.138.300-65");
		funcionario.setMatricula("103411015520");
		funcionario.setSalario(33768.99);
		
		try {
			String path = "C:\\Temp\\funcionarios\\funcionario.txt";
			
			PrintWriter printWriter = new PrintWriter(path);
			
			printWriter.write("\nID DO FUNCIONARIO...: " + funcionario.getIdFuncionario());
			printWriter.write("\nNOME................: " + funcionario.getNome());
			printWriter.write("\nCPF.................: " + funcionario.getCpf());
			printWriter.write("\nMATRICULA...........: " + funcionario.getMatricula());
			printWriter.write("\nSALARIO.............: " + funcionario.getSalario());
			
			printWriter.flush();
			printWriter.close();
			
			System.out.println("Os dados do funcionário foram cadastrados com sucesso!");
			
		}
		catch (Exception e) {
			System.out.println("Erro ao cadastrar funcionário.");
			e.printStackTrace();
		}
		
	}
	
}
