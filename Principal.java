
public class Principal {
	Estagiario e1, e2;
	Monitor m1, m2;
	Professor p1, p2;
	public static void main (String args[]) {
		Principal p = new Principal();
		p.entraDados();
		p.mostraDados();
	}
	public void entraDados() {
		e1=new Estagiario();
		e1.setNome("Vini Jr.");
		e1.setCiclo(2);
		e1.setRa(2828);
		e1.setSalario("99999");
		e2=new Estagiario();
		e2.setNome("Rodrigol");
		e2.setCiclo(1);
		e2.setRa(1919);
		e2.setSalario("99999");
		m1=new Monitor();
		m1.setNome("Modric");
		m1.setCiclo(6);
		m1.setRa(1010);
		m1.setDisciplina("História");
		m2=new Monitor();
		m2.setNome("Sérgio Ramos");
		m2.setCiclo(10);
		m2.setRa(4444);
		m2.setDisciplina("História");
		p1=new Professor();
		p1.setNome("Zidane");
		p1.setTitulacao("Mestre");
		p1.setSalario(9999898989.99);
		p2=new Professor();
		p2.setNome("Solari");
		p2.setTitulacao("Aprendiz");
		p2.setSalario(9999898989.99);
	}
	public void mostraDados() {
		System.out.println("Estagiários");
		System.out.println("Nome: "+e1.getNome());
		System.out.println("Ciclo "+e1.getCiclo());
		System.out.println("RA: "+e1.getRa());
		System.out.println("Salário: "+e1.getSalario());
		System.out.println("Nome: "+e2.getNome());
		System.out.println("Ciclo "+e2.getCiclo());
		System.out.println("RA: "+e2.getRa());
		System.out.println("Salário: "+e2.getSalario());
		System.out.println("Monitores");
		System.out.println("Nome: "+m1.getNome());
		System.out.println("Ciclo: "+m1.getCiclo());
		System.out.println("RA: "+m1.getRa());
		System.out.println("Disciplina: "+m1.getDisciplina());
		System.out.println("Nome: "+m2.getNome());
		System.out.println("Ciclo: "+m2.getCiclo());
		System.out.println("RA: "+m2.getRa());
		System.out.println("Disciplina: "+m2.getDisciplina());
		System.out.println("Professores");
		System.out.println("Nome: "+p1.getNome());
		System.out.println("Titulação: " p1.getTitulacao());
		System.out.println("Salário: "+p1.getSalario());
		System.out.println("Nome: "+p2.getNome());
		System.out.println("Titulação: "+p2.getTitulacao());
		System.out.println("Salário: "+p2.getSalario());
	}
}
