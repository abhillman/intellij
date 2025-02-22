/*
 * Copyright 2016 The Bazel Authors. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.idea.common.experiments;

import com.intellij.openapi.extensions.ExtensionPointName;
import java.util.Map;

interface ExperimentLoader {

  ExtensionPointName<ExperimentLoader> EP_NAME =
      ExtensionPointName.create("com.google.idea.blaze.ExperimentLoader");
  /**
   * Load the map of experiment names to values. Experiment names must be hashed from their
   * canonical value with SHA-512.
   *
   * @see HashingExperimentLoader
   */
  Map<String, String> getExperiments();

  void initialize();
}
