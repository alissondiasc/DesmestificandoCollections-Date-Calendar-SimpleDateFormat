package br.com.listFrameworkCollections;

import java.util.*;

public class Aluno implements Comparable<Aluno> {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Alisson", "Ciência da Computação", 10);
		Aluno a2 = new Aluno("Alan", "Ensino Fundamental", 0);
		Aluno a3 = new Aluno("Alex", "Tecnologia da informação", 10);
		// Objeto duplicado para usar a interface set
		Aluno a4 = new Aluno("Alisson", "Ciência da Computação", 10);

		List<Aluno> alunos = new ArrayList<>();
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		Collections.sort(alunos);

		Aluno aluno;
		Iterator<Aluno> itr = alunos.iterator();
		while (itr.hasNext()) {
			aluno = itr.next();
			System.out.println(aluno.getNome());
		}

		System.out.println("______________________________________________");
		Set<Aluno> alunos2 = new HashSet<Aluno>();
		alunos2.add(a1);
		alunos2.add(a2);
		alunos2.add(a3);
		alunos2.add(a4);

		System.out.println(alunos2);

		Map<String, Aluno> mapa = new TreeMap<String, Aluno>();

		Aluno a = new Aluno("João da Silva", "Linux básico", 0);
		Aluno b = new Aluno("Antonio Sousa", "OpenOffice", 0);
		Aluno c = new Aluno("Lúcia Ferreira", "Internet", 0);
		Aluno d = new Aluno("Benedito Silva", "OpenOffice", 0);
		mapa.put("João da Silva", a);
		mapa.put("Antonio Sousa", b);
		mapa.put("Lúcia Ferreira", c);
		mapa.put("Benedito Silva", d);
		System.out.println(mapa);

		System.out.println(mapa.get("Lúcia Ferreira").getCurso());

		Collection<Aluno> alunos3 = mapa.values();
		for (Aluno e : alunos3) {
			System.out.println(e.getNome());
		}

	}

	private String nome;
	private String curso;
	private double nota;

	public Aluno(String nome, String curso, double nota) {
		super();
		this.nome = nome;
		this.curso = curso;
		this.nota = nota;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	@Override
	public int compareTo(Aluno aluno) {

		return this.nome.compareTo(aluno.getNome());
	}

	// Codigo gerado automaticamente pelo eclipse
	// @Override
	// public int hashCode() {
	// final int prime = 31;
	// int result = 1;
	// result = prime * result + ((curso == null) ? 0 : curso.hashCode());
	// result = prime * result + ((nome == null) ? 0 : nome.hashCode());
	// long temp;
	// temp = Double.doubleToLongBits(nota);
	// result = prime * result + (int) (temp ^ (temp >>> 32));
	// return result;
	// }
	//
	// @Override
	// public boolean equals(Object obj) {
	// if (this == obj)
	// return true;
	// if (obj == null)
	// return false;
	// if (getClass() != obj.getClass())
	// return false;
	// Aluno other = (Aluno) obj;
	// if (curso == null) {
	// if (other.curso != null)
	// return false;
	// } else if (!curso.equals(other.curso))
	// return false;
	// if (nome == null) {
	// if (other.nome != null)
	// return false;
	// } else if (!nome.equals(other.nome))
	// return false;
	// if (Double.doubleToLongBits(nota) != Double.doubleToLongBits(other.nota))
	// return false;
	// return true;
	// }
	// Codigo simplificado para facilitar o entendimento
	public boolean equals(Object o) {
		Aluno a = (Aluno) o;
		return this.nome.equals(a.getNome());
	}

	public int hashCode() {
		return this.nome.hashCode();
	}

}
