package ar.edu.utn.frba.dds.queMePongo.exceptions;

public class PrendaInvalidaException extends RuntimeException {
  public PrendaInvalidaException(String causa) {
    super(causa);
  }
}