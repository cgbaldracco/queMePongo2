package ar.edu.utn.frba.dds.queMePongo;

import ar.edu.utn.frba.dds.queMePongo.exceptions.ColorInvalidoException;
import ar.edu.utn.frba.dds.queMePongo.exceptions.TipoPrendaInvalidoException;
import ar.edu.utn.frba.dds.queMePongo.exceptions.TramaInvalidaException;
import ar.edu.utn.frba.dds.queMePongo.exceptions.MaterialInvalidoException;

public class Borrador {
  private TipoPrenda tipoPrenda;
  private Material material;
  private Color colorPrimario;
  private Color colorSecundario;
  private Trama trama = Trama.LISA;

  public Borrador(TipoPrenda tipoPrenda) {
    if(tipoPrenda == null) {
      throw new TipoPrendaInvalidoException("El tipo de prenda ingresado no es correcto");
    }
    this.tipoPrenda = tipoPrenda;
  }

  public Prenda crearPrenda() {
    Prenda prenda = new Prenda(tipoPrenda, material, colorPrimario, trama);
    prenda.indicarColorSecundario(colorSecundario);
    return prenda;
  }

  /*public void especificarTipo(TipoPrenda tipoPrenda) {
    if(tipoPrenda == null) {
      throw new TipoPrendaInvalidoException("El tipo de prenda ingresado no es correcto");
    }
    this.tipoPrenda = tipoPrenda;
  }*/

  public void especificarMaterial(Material material) {
    if(material == null) {
      throw new MaterialInvalidoException("El material ingresado no es correcto");
    }
    this.material = material;
  }

  public void especificarColorPrimario(Color colorPrimario) {
    if(colorPrimario == null) {
      throw new ColorInvalidoException("El color primario ingresado no es correcto");
    }
    this.colorPrimario = colorPrimario;
  }

  public void especificarColorSecundario(Color colorSecundario) {
    if(colorSecundario == null) {
      throw new ColorInvalidoException("El color secundario ingresado no es correcto");
    }
    this.colorSecundario = colorSecundario;
  }

  public void especificarTrama(Trama trama) {
    if(trama == null) {
      throw new TramaInvalidaException("La trama ingresada no es correcta");
    }
    this.trama = trama;
  }
}
