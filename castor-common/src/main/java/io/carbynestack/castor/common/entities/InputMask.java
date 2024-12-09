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
 * A specialized {@link Tuple} of type <i>InputMask</i>.
 *
 * @param <F> Defines the {@link Field} the {@link Tuple}'s data is element of
 */
@JsonTypeName("InputMask")
public class InputMask<F extends Field> extends ArrayBackedTuple<InputMask<F>, F> {

  @JsonCreator
  InputMask(
      @JsonProperty(value = "field", required = true) F field,
      @JsonProperty(value = "tupleFamily", required = true) String tupleFamily,
      @JsonProperty(value = "shares", required = true) Share... shares) {
    super(field, tupleFamily, shares);
  }

  public InputMask(F field, String tupleFamily, Share a) {
    super(field, tupleFamily, a);
  }

  InputMask(F field, InputStream inputStream, String tupleFamily) throws IOException {
    super(field, inputStream, tupleFamily);
  }
}
