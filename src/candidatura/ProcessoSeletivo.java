package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
	
public static void main(String[] args) {
	String candidatos[]= {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRICIO"};
	
	for (String candidato : candidatos) {
		entrandoEmContato(candidato);
	}
}

static void entrandoEmContato(String candidato) {
	int tentativasRealizadas=1;
	boolean continuaTentando=true;
	boolean atendeu=false;
	
	do {
		
		atendeu=atender();
		continuaTentando=!atendeu;
		if (continuaTentando) {
			tentativasRealizadas++;
		}else {
			System.out.println("CONTATO REALIZADO COM SUCESSO");
		}
	}while(continuaTentando && tentativasRealizadas<3);
	
	if (atendeu) {
		System.out.println("CONSEGUIMOS CONTATO COM "+candidato+" NA "+tentativasRealizadas+"ª TENTATIVA");
	}else {
		System.out.println("NÃO CONSEGUIMOS CONTATO COM "+candidato+" NUMERO MAXIMO DE TENTATIVAS REALIZADAS "+tentativasRealizadas);
	}
}

static boolean atender() {
	return new Random().nextInt(3)==1;
}

static void imprimirSelecionados() {
	String candidatos[]= {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRICIO"};
	
	System.out.println("Forma Abreviada de percorrer o array forEach");
	
	for (String candidado : candidatos) {
		System.out.println("O candidato selecionado foi: "+candidado);
	}
}

static void selecaoDeCandidatos() {
	
	String [] candidatos= {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRICIO","MIRELA","DANIELA","JORGE","SUELLEN","FLÁVIO","UBIRAJARA","SÔNIA","ORNALDO","VIVIAN"};
	
	int candidatosSelecionados=0;
	int candidatoAtual=0;
	double salarioBase=2000.0;
	
	while (candidatosSelecionados<5 && candidatoAtual<candidatos.length) {
		String candidato=candidatos[candidatoAtual];
		double salarioPretendido=valorPretendido();
		
		System.out.println("O Candidato: "+candidato+" solicitou este valor de salário: "+salarioPretendido);
		
		if (salarioBase>salarioPretendido) {
			System.out.println("O candidato: "+candidato+" foi selecionado para vaga");
			candidatosSelecionados++;
		}
		
		candidatoAtual++;
	}
	
}

static double valorPretendido() {
	return ThreadLocalRandom.current().nextDouble(1800,2200);
}

static void analisarCandidato(double salarioPretendido) {
	
	double salarioBase=2000;
	
	if(salarioBase>salarioPretendido) {
		System.out.println("LIGAR PARA O CANDIDATO.");
	} else if (salarioBase==salarioPretendido) {
		System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA.");
	}else {
		System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS.");
	}
}

}
