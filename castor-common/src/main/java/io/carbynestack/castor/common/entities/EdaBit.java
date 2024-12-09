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
@JsonTypeName("EdaBit")
public class EdaBit<F extends Field> extends ArrayBackedTuple<EdaBit<F>, F> {
  @JsonCreator
  EdaBit(
      @JsonProperty(value = "field", required = true) F field,
      @JsonProperty(value = "tupleFamily", required = true) String tupleFamily,
      @JsonProperty(value = "shares", required = true) Share... shares) {
    super(field, tupleFamily, shares);
  }

  public EdaBit(F field, String tupleFamily, Share a) {
    super(field, tupleFamily, a);
  }

  EdaBit(F field, InputStream inputStream, String tupleFamily) throws IOException {
    super(field, inputStream, tupleFamily);
  }
}
