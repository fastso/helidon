/*
 * Copyright (c) 2017, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.helidon.config;

import io.helidon.config.internal.PropertiesConfigParser;
import io.helidon.config.spi.ConfigParser;

/**
 * Provides access to built-in {@link io.helidon.config.spi.ConfigParser} implementations.
 *
 * @see io.helidon.config.spi.ConfigParser
 */
public final class ConfigParsers {

    private ConfigParsers() {
        throw new AssertionError("Instantiation not allowed.");
    }

    /**
     * Returns a {@link ConfigParser} implementation that parses Java Properties content
     * (the media type {@value io.helidon.config.internal.PropertiesConfigParser#MEDIA_TYPE_TEXT_JAVA_PROPERTIES}).
     * <p>
     * @return {@code ConfigParser} that parses Java Properties content
     */
    public static ConfigParser properties() {
        return new PropertiesConfigParser();
    }

}
