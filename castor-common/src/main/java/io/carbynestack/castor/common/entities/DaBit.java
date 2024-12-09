/*
 * Copyright (c) 2021 - for information on the respective copyright owner
 * see the NOTICE file and/or the repository https://github.com/carbynestack/castor.
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package io.carbynestack.castor.common.entities;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.IOException;
import java.io.InputStream;

/**
 * A specialized {@link Tuple} of type <i>DaBit</i>.
 *
 * @param <F> Defines the {@link Field} the {@link Tuple}'s data is element of
 */
@JsonTypeName("DaBit")
public class DaBit<F extends Field> extends ArrayBackedTuple<Bit<F>, F> {
  @JsonCreator
  DaBit(
      @JsonProperty(value = "field", required = true) F field,
      @JsonProperty(value = "shares", required = true) Share... shares) {
    super(field, shares);
  }

  public DaBit(F field, Share a) {
    super(field, a);
  }

  DaBit(F field, InputStream inputStream) throws IOException {
    super(field, inputStream);
  }
}
