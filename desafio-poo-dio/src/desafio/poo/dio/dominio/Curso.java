package desafio.poo.dio.dominio;

public class Curso extends Conteudo{
	
	private int cargaHoraria;
	
	@Override
	public double calcularXp() {
		return XP_PADRAO * cargaHoraria;
	}
	
	public Curso(String titulo, String descricao, int cargaHoraria) {
		this.setTitulo(titulo);
		this.setDescricao(descricao);
		this.setCargaHoraria(cargaHoraria);
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	@Override
	public String toString() {
		return "Curso - (Título: " + getTitulo() + ", Descrição: " + getDescricao() + ", Carga Horária: "  + cargaHoraria + ")\n";
	}

	
	
	
}
