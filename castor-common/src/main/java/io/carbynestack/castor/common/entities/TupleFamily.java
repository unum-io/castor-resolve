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
  COWGEAR("CowGear", 2, 1, 9),
  HEMI("Hemi", 1, 64, 8);

  /** Name identifier for the given {@link TupleType} */
  @Getter
  String familyName;

  /** Name identifier for the given {@link TupleType} */
  @Getter
  Integer multiplier;

  /** edabitvec<T>::MAX_SIZE */
  @Getter
  Integer edabitvecMaxSize; 

  /** T::bit_type::part_type::size() */
  @Getter
  Integer bitTypePartTypeSize;

  @Override
  public String toString() {
    return familyName;
  }
}