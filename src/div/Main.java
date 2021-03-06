/*
 * Copyright 2016 Alexandre Terrasa <alexandre@moz-code.org>.
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
package div;

public class Main {

    public static void main(String[] args) {
        MyInteger i0 = new MyInteger(0);
        MyInteger i1 = new MyInteger(1);
        MyInteger i2 = new MyInteger(2);
        // Contrat OK
        i2.div(i1);
        // Contrat FAIL
        i2.div(i0);
    }

}
