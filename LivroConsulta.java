package principiodasegregacaodeinterfaces;

import java.time.LocalDateTime;

public class LivroConsulta implements ILivro {
    public String idItemBiblioteca;
    public String titulo;
    public String autor;
    public int numeroPaginas;

    public void emprestar(String usuarioEmprestimo) {
            	
    }

	public String getIdItemBiblioteca() {
		return idItemBiblioteca;
	}

	public void setIdItemBiblioteca(String idItemBiblioteca) {
		this.idItemBiblioteca = idItemBiblioteca;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	@Override
	public void devolver() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public LocalDateTime getDataDevolver() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getDuracaoEmprestimoEmDias() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setDuracaoEmprestimoEmDias(int duracaoEmprestimoEmDias) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getUsuarioEmprestimo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setUsuarioEmprestimo(String usuarioEmprestimo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public LocalDateTime getDataEmprestimo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDataEmprestimo(LocalDateTime dataEmprestimo) {
		// TODO Auto-generated method stub
		
	}
}
