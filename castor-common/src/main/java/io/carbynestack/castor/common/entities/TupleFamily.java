package io.carbynestack.castor.common.entities;

import static io.carbynestack.castor.common.entities.Field.GF2N;
import static io.carbynestack.castor.common.entities.Field.GFP;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.carbynestack.castor.common.exceptions.CastorClientException;
import java.util.Arrays;
import java.util.Map;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

/**
 * An enumeration which defines the available types of {@link Tuple}s and their
 * characteristics.
 */
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public enum TupleFamily {
  COWGEAR("CowGear", 2),
  HEMI("Hemi", 1);

  /** Name identifier for the given {@link TupleType} */
  @Getter
  String familyName;

  /** Name identifier for the given {@link TupleType} */
  Integer multiplier;

  @Override
  public String toString() {
    return familyName;
  }
}
