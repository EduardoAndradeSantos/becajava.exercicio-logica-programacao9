import java.util.Scanner;

public class Votos {
	private int Totaleleitores;
	private float Votosvalidos;
	private float Votosbrancos;
	private float Votosnulos;
	private float Calculavalidos;
	private float Calculabrancos;
	private float Calculanulos;
	public Scanner leitor = new Scanner(System.in);

	public Votos() {
		pegaDados();
		calculaPorcentagem();
		exibeResultado();
	}

	public void pegaDados() {
		System.out.printf("Digite o total de eleitores: ");
		Totaleleitores = leitor.nextInt();
		System.out.printf("Digite o total de votos válidos: ");
		Votosvalidos = leitor.nextFloat();
		System.out.printf("Digite o total de votos brancos: ");
		Votosbrancos = leitor.nextFloat();
		System.out.printf("Digite o total de votos nulos: ");
		Votosnulos = leitor.nextFloat();
	}

	public void calculaPorcentagem() {
		Calculavalidos = (Votosvalidos / Totaleleitores) * 100;
		Calculabrancos = (Votosbrancos / Totaleleitores) * 100;
		Calculanulos = (Votosnulos / Totaleleitores) * 100;
	}

	public void exibeResultado() {
		System.out.println("votos nulos: " + Votosnulos + ("%"));
		System.out.println("votos validos: " + Votosvalidos + ("%"));
		System.out.println("votos brancos: " + Votosbrancos + ("%"));
	}
}
