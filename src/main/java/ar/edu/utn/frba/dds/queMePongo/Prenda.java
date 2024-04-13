package ar.edu.utn.frba.dds.queMePongo;

import ar.edu.utn.frba.dds.queMePongo.exceptions.PrendaInvalidaException;

public class Prenda {
  private TipoPrenda tipoPrenda;
  private Material material;
  private Color colorPrimario;
  private Color colorSecundario;
  private Trama trama;

  public Prenda(TipoPrenda tipoPrenda, Material material, Color colorPrimario, Trama trama) {
    this.tipoPrenda = tipoPrenda;
    this.material = material;
    this.colorPrimario = colorPrimario;
    this.trama = trama;
  }

  private TipoPrenda getTipoPrenda() {
    return tipoPrenda;
  }

  private Material getMaterial() {
    return material;
  }

  private Color getColorPrimario() {
    return colorPrimario;
  }

  private Color getColorSecundario() {
    return colorSecundario;
  }

  public void indicarColorSecundario(Color colorSecundario) {
    this.setColorSecundario(colorSecundario);
  }

  private void setColorSecundario(Color colorSecundario) {
    this.colorSecundario = colorSecundario;
  }

  public Trama getTrama() {
    return trama;
  }

  public Categoria obtenerCategoria() {
    return tipoPrenda.obtenerCategoria();
  }
}