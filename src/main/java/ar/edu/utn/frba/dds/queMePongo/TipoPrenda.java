package ar.edu.utn.frba.dds.queMePongo;

public class TipoPrenda {
  private Categoria categoria;

  public TipoPrenda(Categoria categoria) {
    this.categoria = categoria;
  }

  static TipoPrenda REMERA = new TipoPrenda(Categoria.PARTE_SUPERIOR);
  static TipoPrenda PANTALON = new TipoPrenda(Categoria.PARTE_INFERIOR);
  static TipoPrenda BUZO = new TipoPrenda(Categoria.PARTE_SUPERIOR);
  static TipoPrenda CAMPERA = new TipoPrenda(Categoria.ABRIGO);
  static TipoPrenda ZAPATO = new TipoPrenda(Categoria.CALZADO);
  static TipoPrenda ZAPATILLA = new TipoPrenda(Categoria.CALZADO);
  static TipoPrenda BLUSA = new TipoPrenda(Categoria.PARTE_SUPERIOR);
  static TipoPrenda SHORT = new TipoPrenda(Categoria.PARTE_INFERIOR);
  static TipoPrenda MALLA = new TipoPrenda(Categoria.PARTE_INFERIOR);
  static TipoPrenda SANDALIA = new TipoPrenda(Categoria.CALZADO);
  static TipoPrenda AROS = new TipoPrenda(Categoria.ACCESORIO);

  public Categoria obtenerCategoria() {
    return this.categoria;
  }

}