package desafio.poo.dio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

	private LocalDate data;
	
	@Override
	public double calcularXp() {
		return XP_PADRAO + 10d;
	}
	
	public Mentoria(String titulo, String descricao, LocalDate data) {
		this.setDescricao(descricao);
		this.setTitulo(titulo);
		this.setData(data);
	}
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "Mentoria - (Título: " + getTitulo() + ", Descrição: " + getDescricao() + ", Data: " + data + ")";
	}
	
		
}
