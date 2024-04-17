package back;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Agenda {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Calendar cal1 = Calendar.getInstance();
	
	List<Tarefa> list = new ArrayList<>();

	public Agenda() {
	}
	
	public List<Tarefa> imprimeTarefaMes(Date data) {
		
		List<Tarefa> tarefasMes = new ArrayList<>();
		
		cal1.setTime(data);
		int mes = cal1.get(Calendar.MONTH) + 1;
		int ano = cal1.get(Calendar.YEAR);
		
		for(Tarefa tarefa : list) {
			Calendar cal2 = Calendar.getInstance();
			int mesTarefa = cal2.get(Calendar.MONTH) + 1;
			int anoTarefa = cal2.get(Calendar.YEAR);
			if(mesTarefa == mes && anoTarefa == ano) {
				tarefasMes.add(tarefa);
			}
		}
		
		return tarefasMes;
		
	}
	
	@Override
	public String toString() {
		return 
	}
	
}
