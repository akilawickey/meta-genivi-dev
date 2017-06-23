# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "zebkit"
HOMEPAGE = "https://github.com/barmalei/zebra"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# NOTE: multiple licenses have been detected; if that is correct you should separate
# these in the LICENSE value using & if the multiple licenses all apply, or | if there
# is a choice between the multiple licenses. If in doubt, check the accompanying
# documentation to determine which situation is applicable.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   LICENSE
#   src/jekyll/LICENSE.md
#   website/LICENSE.md
#   node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/tough-cookie/LICENSE
#   node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/html-encoding-sniffer/LICENSE.txt
#   node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/html-encoding-sniffer/node_modules/whatwg-encoding/LICENSE.txt
#   node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/whatwg-encoding/LICENSE.txt
#   node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/xml-name-validator/LICENSE.txt
#   node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/content-type-parser/LICENSE.txt
#   node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/sax/LICENSE
#   node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/escodegen/LICENSE.source-map
#   node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/escodegen/LICENSE.BSD
#   node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/escodegen/node_modules/esprima/LICENSE.BSD
#   node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/escodegen/node_modules/source-map/LICENSE
#   node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/escodegen/node_modules/source-map/node_modules/amdefine/LICENSE
#   node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/escodegen/node_modules/esutils/LICENSE.BSD
#   node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/escodegen/node_modules/estraverse/LICENSE.BSD
#   node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/webidl-conversions/LICENSE.md
#   node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/LICENSE
#   node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/hawk/LICENSE
#   node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/hawk/node_modules/boom/LICENSE
#   node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/hawk/node_modules/boom/node_modules/hoek/LICENSE
#   node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/hawk/node_modules/hoek/LICENSE
#   node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/hawk/node_modules/cryptiles/LICENSE
#   node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/hawk/node_modules/cryptiles/node_modules/boom/LICENSE
#   node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/hawk/node_modules/cryptiles/node_modules/boom/node_modules/hoek/LICENSE
#   node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/hawk/node_modules/sntp/LICENSE
#   node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/hawk/node_modules/sntp/node_modules/hoek/LICENSE
#   node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/tunnel-agent/LICENSE
#   node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/tough-cookie/LICENSE
#   node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/caseless/LICENSE
#   node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/forever-agent/LICENSE
#   node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/aws-sign2/LICENSE
#   node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/qs/LICENSE
#   node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/oauth-sign/LICENSE
#   node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/isstream/LICENSE.md
#   node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/ecc-jsbn/lib/LICENSE-jsbn
#   node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/ecc-jsbn/node_modules/jsbn/LICENSE
#   node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/bcrypt-pbkdf/node_modules/tweetnacl/LICENSE
#   node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/jsbn/LICENSE
#   node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/asn1/LICENSE
#   node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/tweetnacl/LICENSE
#   node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/dashdash/LICENSE.txt
#   node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/http-signature/node_modules/jsprim/LICENSE
#   node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/http-signature/node_modules/jsprim/node_modules/extsprintf/LICENSE
#   node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/http-signature/node_modules/jsprim/node_modules/verror/LICENSE
#   node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/http-signature/node_modules/jsprim/node_modules/verror/node_modules/extsprintf/LICENSE
#   node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/whatwg-url/node_modules/webidl-conversions/LICENSE.md
#
LICENSE = "OR & BSD-3-Clause & Unknown & Unlicense & Public & WTFPL & ISC & Apache-2.0 & MIT & Domain & BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4307adfb48e9af7d15224db7286b4f40 \
                    file://apidoc/assets/vendor/prettify/COPYING;md5=3b83ef96387f14655fc854ddc3c6bd57 \
                    file://src/jekyll/LICENSE.md;md5=32da151e0bd7e7c37ad3be4b8a23b1b5 \
                    file://website/LICENSE.md;md5=32da151e0bd7e7c37ad3be4b8a23b1b5 \
                    file://node_modules/browser-env/LICENSE;md5=ac0ffd80aeee9e9fa7cddd3b9410c00f \
                    file://node_modules/browser-env/node_modules/window/LICENSE;md5=ac0ffd80aeee9e9fa7cddd3b9410c00f \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/LICENSE.txt;md5=2bb1ae97ca2ffffc8d1ddd174b08c9a2 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/tough-cookie/LICENSE;md5=ceb9c658d7a5d62bee6628c46832168e \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/tough-cookie/node_modules/punycode/LICENSE-MIT.txt;md5=ee9bd8b835cfcd512dd644540dd96987 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/html-encoding-sniffer/LICENSE.txt;md5=e7cebb9dc886c7e3b211874d595a4369 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/html-encoding-sniffer/node_modules/whatwg-encoding/LICENSE.txt;md5=e7cebb9dc886c7e3b211874d595a4369 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/html-encoding-sniffer/node_modules/whatwg-encoding/node_modules/iconv-lite/LICENSE;md5=f942263d98f0d75e0e0101884e86261d \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/whatwg-encoding/LICENSE.txt;md5=e7cebb9dc886c7e3b211874d595a4369 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/whatwg-encoding/node_modules/iconv-lite/LICENSE;md5=f942263d98f0d75e0e0101884e86261d \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/xml-name-validator/LICENSE.txt;md5=2eaca7f1b8838b275ce5fd59135cdfd8 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/content-type-parser/LICENSE.txt;md5=e7cebb9dc886c7e3b211874d595a4369 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/acorn-globals/LICENSE;md5=b689321798b9c3969e0467719ddacf2e \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/acorn-globals/node_modules/acorn/LICENSE;md5=2267f77565f4e1089f3390bdd7a11ecd \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/cssstyle/MIT-LICENSE.txt;md5=c640439ba331557f331a6af5d9f5d8ab \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/cssstyle/node_modules/cssom/LICENSE.txt;md5=8fff5caac66e008d7e7f3d5b36688d52 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/acorn/LICENSE;md5=2267f77565f4e1089f3390bdd7a11ecd \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/sax/LICENSE;md5=326d5674181c4bb210e424772c60fa80 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/cssom/LICENSE.txt;md5=8fff5caac66e008d7e7f3d5b36688d52 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/parse5/LICENSE;md5=75236aec0afe93426f750ca48489a0b9 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/escodegen/LICENSE.source-map;md5=e072648d499fc8016e8b190815ad212f \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/escodegen/LICENSE.BSD;md5=e74cede38e957fe3e525b0e53a510bcf \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/escodegen/node_modules/esprima/LICENSE.BSD;md5=3e0ad2b4a2d836d43cf3c7b46c34512c \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/escodegen/node_modules/optionator/LICENSE;md5=7733af876e78a187f3a51e7c276ae883 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/escodegen/node_modules/optionator/node_modules/prelude-ls/LICENSE;md5=7733af876e78a187f3a51e7c276ae883 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/escodegen/node_modules/optionator/node_modules/levn/LICENSE;md5=7733af876e78a187f3a51e7c276ae883 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/escodegen/node_modules/optionator/node_modules/levn/node_modules/prelude-ls/LICENSE;md5=7733af876e78a187f3a51e7c276ae883 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/escodegen/node_modules/optionator/node_modules/levn/node_modules/type-check/LICENSE;md5=7733af876e78a187f3a51e7c276ae883 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/escodegen/node_modules/optionator/node_modules/levn/node_modules/type-check/node_modules/prelude-ls/LICENSE;md5=7733af876e78a187f3a51e7c276ae883 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/escodegen/node_modules/optionator/node_modules/fast-levenshtein/LICENSE.md;md5=a3e99e82761a3c89e44fe0bc43f82b94 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/escodegen/node_modules/optionator/node_modules/type-check/LICENSE;md5=7733af876e78a187f3a51e7c276ae883 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/escodegen/node_modules/optionator/node_modules/type-check/node_modules/prelude-ls/LICENSE;md5=7733af876e78a187f3a51e7c276ae883 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/escodegen/node_modules/optionator/node_modules/deep-is/LICENSE;md5=fb19b42ee6322a4b61b6277fb9e13d89 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/escodegen/node_modules/optionator/node_modules/wordwrap/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/escodegen/node_modules/source-map/LICENSE;md5=b1ca6dbc0075d56cbd9931a75566cd44 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/escodegen/node_modules/source-map/node_modules/amdefine/LICENSE;md5=539b1c7ad0ada7756d6d01b9db20f680 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/escodegen/node_modules/esutils/LICENSE.BSD;md5=e74cede38e957fe3e525b0e53a510bcf \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/escodegen/node_modules/estraverse/LICENSE.BSD;md5=e74cede38e957fe3e525b0e53a510bcf \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/array-equal/LICENSE;md5=c8d3a30332ecb31cfaf4c0a06da18f5c \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/symbol-tree/LICENSE;md5=aa31386c81ddf626d82b160fe7900741 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/webidl-conversions/LICENSE.md;md5=44d86433f305935cb0c3d3cd320e7a34 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/LICENSE;md5=f3f8ead5440d1c311b45be065d135d90 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/hawk/LICENSE;md5=e027b6d4642f6a1131d030b119fa8f50 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/hawk/node_modules/boom/LICENSE;md5=d5c0c437eeeff35277efeadaec74e821 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/hawk/node_modules/boom/node_modules/hoek/LICENSE;md5=0ae863d44c9a840e5cc04241d8d9c736 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/hawk/node_modules/hoek/LICENSE;md5=0ae863d44c9a840e5cc04241d8d9c736 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/hawk/node_modules/cryptiles/LICENSE;md5=6e2f87804ca8061967f7891dfb34f6f0 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/hawk/node_modules/cryptiles/node_modules/boom/LICENSE;md5=d5c0c437eeeff35277efeadaec74e821 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/hawk/node_modules/cryptiles/node_modules/boom/node_modules/hoek/LICENSE;md5=0ae863d44c9a840e5cc04241d8d9c736 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/hawk/node_modules/sntp/LICENSE;md5=6b3f1791e9fe721a645d793af56193c6 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/hawk/node_modules/sntp/node_modules/hoek/LICENSE;md5=0ae863d44c9a840e5cc04241d8d9c736 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/tunnel-agent/LICENSE;md5=f3f8ead5440d1c311b45be065d135d90 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/tunnel-agent/node_modules/safe-buffer/LICENSE;md5=badd5e91c737e7ffdf10b40c1f907761 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/tough-cookie/LICENSE;md5=ceb9c658d7a5d62bee6628c46832168e \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/tough-cookie/node_modules/punycode/LICENSE-MIT.txt;md5=ee9bd8b835cfcd512dd644540dd96987 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/stringstream/LICENSE.txt;md5=3b3d0996fc07ae2d89c4659b9ffcbe2e \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/caseless/LICENSE;md5=e9dadf023ba6ebd98e3e0acb6e2470e3 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/forever-agent/LICENSE;md5=f3f8ead5440d1c311b45be065d135d90 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/aws4/LICENSE;md5=ff6f181928a91d8631d565516b4db3cb \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/mime-types/LICENSE;md5=bf1f9ad1e2e1d507aef4883fff7103de \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/mime-types/node_modules/mime-db/LICENSE;md5=c8d3a30332ecb31cfaf4c0a06da18f5c \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/aws-sign2/LICENSE;md5=f3f8ead5440d1c311b45be065d135d90 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/extend/LICENSE;md5=33d9f7a91df276ec16aa941032ee1476 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/combined-stream/License;md5=5270b4ddb6700d0a820e6d066744589c \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/combined-stream/node_modules/delayed-stream/License;md5=5270b4ddb6700d0a820e6d066744589c \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/json-stringify-safe/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/performance-now/license.txt;md5=4c1faf980adc2df1831ff8c0e47897e8 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/is-typedarray/LICENSE.md;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/har-validator/LICENSE;md5=bfa81591facc9224e4c7451c8dc12958 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/har-validator/node_modules/ajv/LICENSE;md5=715855234c57d97032971adfc0608a07 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/har-validator/node_modules/ajv/node_modules/json-stable-stringify/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/har-validator/node_modules/ajv/node_modules/co/LICENSE;md5=1cb994f27906c83d46a3cc6d9e1d8d6c \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/har-validator/node_modules/har-schema/LICENSE;md5=bfa81591facc9224e4c7451c8dc12958 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/qs/LICENSE;md5=d5c7c6dc45a33a0a9620ed81315672d7 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/uuid/LICENSE.md;md5=c9420736e23afb538ba5fbe44197f0b4 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/oauth-sign/LICENSE;md5=f3f8ead5440d1c311b45be065d135d90 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/isstream/LICENSE.md;md5=1798150b9d70250c42b55b3530e6af2b \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/http-signature/LICENSE;md5=38ecf0a3a3894f404ca99c2a08924afc \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/http-signature/node_modules/sshpk/LICENSE;md5=38ecf0a3a3894f404ca99c2a08924afc \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/getpass/LICENSE;md5=38ecf0a3a3894f404ca99c2a08924afc \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/ecc-jsbn/LICENSE;md5=0d289b6d63cbcc18e4b2af9a5bd28b54 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/ecc-jsbn/lib/LICENSE-jsbn;md5=32052d48bacabd1c02e56c6889082a27 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/ecc-jsbn/node_modules/jsbn/LICENSE;md5=c6ea389b6b52325149beeec27075c5ac \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/bcrypt-pbkdf/node_modules/tweetnacl/LICENSE;md5=911690f51af322440237a253d695d19f \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/jsbn/LICENSE;md5=c6ea389b6b52325149beeec27075c5ac \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/asn1/LICENSE;md5=5ce2f42143c298495637e28e40cd5462 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/tweetnacl/LICENSE;md5=911690f51af322440237a253d695d19f \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/dashdash/LICENSE.txt;md5=ebce61c1a0900d798daaf5853c69ce72 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/http-signature/node_modules/jsprim/LICENSE;md5=bc3c23d98d7aa86bbf232058884e19b2 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/http-signature/node_modules/jsprim/node_modules/extsprintf/LICENSE;md5=bc3c23d98d7aa86bbf232058884e19b2 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/http-signature/node_modules/jsprim/node_modules/verror/LICENSE;md5=bc3c23d98d7aa86bbf232058884e19b2 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/http-signature/node_modules/jsprim/node_modules/verror/node_modules/extsprintf/LICENSE;md5=bc3c23d98d7aa86bbf232058884e19b2 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/safe-buffer/LICENSE;md5=badd5e91c737e7ffdf10b40c1f907761 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/form-data/License;md5=7aa505292e2636a9e59d4d3f258f4819 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/form-data/node_modules/asynckit/LICENSE;md5=177bc287fb9558bf3ea50b440c1c86ff \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/form-data/node_modules/mime-types/LICENSE;md5=bf1f9ad1e2e1d507aef4883fff7103de \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/form-data/node_modules/mime-types/node_modules/mime-db/LICENSE;md5=c8d3a30332ecb31cfaf4c0a06da18f5c \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/form-data/node_modules/combined-stream/License;md5=5270b4ddb6700d0a820e6d066744589c \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/request/node_modules/form-data/node_modules/combined-stream/node_modules/delayed-stream/License;md5=5270b4ddb6700d0a820e6d066744589c \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/nwmatcher/LICENSE;md5=682160478b4def04855b3f9e293da522 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/whatwg-url/LICENSE.txt;md5=5ab9113efe10eeab888f7502d1c2e894 \
                    file://node_modules/browser-env/node_modules/window/node_modules/jsdom/node_modules/whatwg-url/node_modules/webidl-conversions/LICENSE.md;md5=44d86433f305935cb0c3d3cd320e7a34"

SRC_URI = "npm://registry.npmjs.org;name=zebkit;version=1.0.0"

NPM_SHRINKWRAP := "${THISDIR}/${PN}/npm-shrinkwrap.json"
NPM_LOCKDOWN := "${THISDIR}/${PN}/lockdown.json"

inherit npm

# Must be set after inherit npm since that itself sets S
S = "${WORKDIR}/npmpkg"
LICENSE_${PN}-browser-env-window-jsdom-abab = "ISC"
LICENSE_${PN}-browser-env-window-jsdom-acorn-globals-acorn = "MIT"
LICENSE_${PN}-browser-env-window-jsdom-acorn-globals = "MIT"
LICENSE_${PN}-browser-env-window-jsdom-acorn = "MIT"
LICENSE_${PN}-browser-env-window-jsdom-array-equal = "MIT"
LICENSE_${PN}-browser-env-window-jsdom-content-type-parser = "WTFPL"
LICENSE_${PN}-browser-env-window-jsdom-cssom = "MIT"
LICENSE_${PN}-browser-env-window-jsdom-cssstyle-cssom = "MIT"
LICENSE_${PN}-browser-env-window-jsdom-cssstyle = "MIT"
LICENSE_${PN}-browser-env-window-jsdom-escodegen-esprima = "BSD-2-Clause"
LICENSE_${PN}-browser-env-window-jsdom-escodegen-estraverse = "Unknown"
LICENSE_${PN}-browser-env-window-jsdom-escodegen-esutils = "Unknown"
LICENSE_${PN}-browser-env-window-jsdom-escodegen-optionator-deep-is = "MIT"
LICENSE_${PN}-browser-env-window-jsdom-escodegen-optionator-fast-levenshtein = "MIT"
LICENSE_${PN}-browser-env-window-jsdom-escodegen-optionator-levn-prelude-ls = "MIT"
LICENSE_${PN}-browser-env-window-jsdom-escodegen-optionator-levn-type-check-prelude-ls = "MIT"
LICENSE_${PN}-browser-env-window-jsdom-escodegen-optionator-levn-type-check = "MIT"
LICENSE_${PN}-browser-env-window-jsdom-escodegen-optionator-levn = "MIT"
LICENSE_${PN}-browser-env-window-jsdom-escodegen-optionator-prelude-ls = "MIT"
LICENSE_${PN}-browser-env-window-jsdom-escodegen-optionator-type-check-prelude-ls = "MIT"
LICENSE_${PN}-browser-env-window-jsdom-escodegen-optionator-type-check = "MIT"
LICENSE_${PN}-browser-env-window-jsdom-escodegen-optionator-wordwrap = "MIT"
LICENSE_${PN}-browser-env-window-jsdom-escodegen-optionator = "MIT"
LICENSE_${PN}-browser-env-window-jsdom-escodegen-source-map-amdefine = "BSD-3-Clause OR MIT"
LICENSE_${PN}-browser-env-window-jsdom-escodegen-source-map = "Unknown"
LICENSE_${PN}-browser-env-window-jsdom-escodegen = "BSD-2-Clause"
LICENSE_${PN}-browser-env-window-jsdom-html-encoding-sniffer-whatwg-encoding-iconv-lite = "MIT"
LICENSE_${PN}-browser-env-window-jsdom-html-encoding-sniffer-whatwg-encoding = "WTFPL"
LICENSE_${PN}-browser-env-window-jsdom-html-encoding-sniffer = "WTFPL"
LICENSE_${PN}-browser-env-window-jsdom-nwmatcher = "MIT"
LICENSE_${PN}-browser-env-window-jsdom-parse5 = "MIT"
LICENSE_${PN}-browser-env-window-jsdom-request-aws-sign2 = "Apache-2.0"
LICENSE_${PN}-browser-env-window-jsdom-request-aws4 = "MIT"
LICENSE_${PN}-browser-env-window-jsdom-request-caseless = "Apache-2.0"
LICENSE_${PN}-browser-env-window-jsdom-request-combined-stream-delayed-stream = "MIT"
LICENSE_${PN}-browser-env-window-jsdom-request-combined-stream = "MIT"
LICENSE_${PN}-browser-env-window-jsdom-request-extend = "MIT"
LICENSE_${PN}-browser-env-window-jsdom-request-forever-agent = "Apache-2.0"
LICENSE_${PN}-browser-env-window-jsdom-request-form-data-asynckit = "MIT"
LICENSE_${PN}-browser-env-window-jsdom-request-form-data-combined-stream-delayed-stream = "MIT"
LICENSE_${PN}-browser-env-window-jsdom-request-form-data-combined-stream = "MIT"
LICENSE_${PN}-browser-env-window-jsdom-request-form-data-mime-types-mime-db = "MIT"
LICENSE_${PN}-browser-env-window-jsdom-request-form-data-mime-types = "MIT"
LICENSE_${PN}-browser-env-window-jsdom-request-form-data = "MIT"
LICENSE_${PN}-browser-env-window-jsdom-request-har-validator-ajv-co = "MIT"
LICENSE_${PN}-browser-env-window-jsdom-request-har-validator-ajv-json-stable-stringify-jsonify = "Public Domain"
LICENSE_${PN}-browser-env-window-jsdom-request-har-validator-ajv-json-stable-stringify = "MIT"
LICENSE_${PN}-browser-env-window-jsdom-request-har-validator-ajv = "MIT"
LICENSE_${PN}-browser-env-window-jsdom-request-har-validator-har-schema = "ISC"
LICENSE_${PN}-browser-env-window-jsdom-request-har-validator = "ISC"
LICENSE_${PN}-browser-env-window-jsdom-request-hawk-boom-hoek = "BSD-3-Clause"
LICENSE_${PN}-browser-env-window-jsdom-request-hawk-boom = "BSD-3-Clause"
LICENSE_${PN}-browser-env-window-jsdom-request-hawk-cryptiles-boom-hoek = "BSD-3-Clause"
LICENSE_${PN}-browser-env-window-jsdom-request-hawk-cryptiles-boom = "BSD-3-Clause"
LICENSE_${PN}-browser-env-window-jsdom-request-hawk-cryptiles = "BSD-3-Clause"
LICENSE_${PN}-browser-env-window-jsdom-request-hawk-hoek = "BSD-3-Clause"
LICENSE_${PN}-browser-env-window-jsdom-request-hawk-sntp-hoek = "BSD-3-Clause"
LICENSE_${PN}-browser-env-window-jsdom-request-hawk-sntp = "Unknown"
LICENSE_${PN}-browser-env-window-jsdom-request-hawk = "BSD-3-Clause"
LICENSE_${PN}-browser-env-window-jsdom-request-http-signature-assert-plus = "MIT"
LICENSE_${PN}-browser-env-window-jsdom-request-http-signature-jsprim-assert-plus = "MIT"
LICENSE_${PN}-browser-env-window-jsdom-request-http-signature-jsprim-extsprintf = "Unknown"
LICENSE_${PN}-browser-env-window-jsdom-request-http-signature-jsprim-json-schema = "Unknown"
LICENSE_${PN}-browser-env-window-jsdom-request-http-signature-jsprim-verror-extsprintf = "Unknown"
LICENSE_${PN}-browser-env-window-jsdom-request-http-signature-jsprim-verror = "Unknown"
LICENSE_${PN}-browser-env-window-jsdom-request-http-signature-jsprim = "MIT"
LICENSE_${PN}-browser-env-window-jsdom-request-http-signature-sshpk-asn1 = "MIT"
LICENSE_${PN}-browser-env-window-jsdom-request-http-signature-sshpk-assert-plus = "MIT"
LICENSE_${PN}-browser-env-window-jsdom-request-http-signature-sshpk-bcrypt-pbkdf-tweetnacl = "Unlicense"
LICENSE_${PN}-browser-env-window-jsdom-request-http-signature-sshpk-bcrypt-pbkdf = "BSD-3-Clause"
LICENSE_${PN}-browser-env-window-jsdom-request-http-signature-sshpk-dashdash-assert-plus = "MIT"
LICENSE_${PN}-browser-env-window-jsdom-request-http-signature-sshpk-dashdash = "MIT"
LICENSE_${PN}-browser-env-window-jsdom-request-http-signature-sshpk-ecc-jsbn-jsbn = "MIT"
LICENSE_${PN}-browser-env-window-jsdom-request-http-signature-sshpk-ecc-jsbn = "MIT Unknown"
LICENSE_${PN}-browser-env-window-jsdom-request-http-signature-sshpk-getpass-assert-plus = "MIT"
LICENSE_${PN}-browser-env-window-jsdom-request-http-signature-sshpk-getpass = "MIT"
LICENSE_${PN}-browser-env-window-jsdom-request-http-signature-sshpk-jsbn = "MIT"
LICENSE_${PN}-browser-env-window-jsdom-request-http-signature-sshpk-tweetnacl = "Unlicense"
LICENSE_${PN}-browser-env-window-jsdom-request-http-signature-sshpk = "MIT"
LICENSE_${PN}-browser-env-window-jsdom-request-http-signature = "MIT"
LICENSE_${PN}-browser-env-window-jsdom-request-is-typedarray = "MIT"
LICENSE_${PN}-browser-env-window-jsdom-request-isstream = "MIT"
LICENSE_${PN}-browser-env-window-jsdom-request-json-stringify-safe = "ISC"
LICENSE_${PN}-browser-env-window-jsdom-request-mime-types-mime-db = "MIT"
LICENSE_${PN}-browser-env-window-jsdom-request-mime-types = "MIT"
LICENSE_${PN}-browser-env-window-jsdom-request-oauth-sign = "Apache-2.0"
LICENSE_${PN}-browser-env-window-jsdom-request-performance-now = "MIT"
LICENSE_${PN}-browser-env-window-jsdom-request-qs = "BSD-3-Clause"
LICENSE_${PN}-browser-env-window-jsdom-request-safe-buffer = "MIT"
LICENSE_${PN}-browser-env-window-jsdom-request-stringstream = "MIT"
LICENSE_${PN}-browser-env-window-jsdom-request-tough-cookie-punycode = "MIT"
LICENSE_${PN}-browser-env-window-jsdom-request-tough-cookie = "BSD-3-Clause"
LICENSE_${PN}-browser-env-window-jsdom-request-tunnel-agent-safe-buffer = "MIT"
LICENSE_${PN}-browser-env-window-jsdom-request-tunnel-agent = "Apache-2.0"
LICENSE_${PN}-browser-env-window-jsdom-request-uuid = "MIT"
LICENSE_${PN}-browser-env-window-jsdom-request = "Apache-2.0"
LICENSE_${PN}-browser-env-window-jsdom-sax = "ISC"
LICENSE_${PN}-browser-env-window-jsdom-symbol-tree = "MIT"
LICENSE_${PN}-browser-env-window-jsdom-tough-cookie-punycode = "MIT"
LICENSE_${PN}-browser-env-window-jsdom-tough-cookie = "BSD-3-Clause"
LICENSE_${PN}-browser-env-window-jsdom-webidl-conversions = "BSD-2-Clause"
LICENSE_${PN}-browser-env-window-jsdom-whatwg-encoding-iconv-lite = "MIT"
LICENSE_${PN}-browser-env-window-jsdom-whatwg-encoding = "WTFPL"
LICENSE_${PN}-browser-env-window-jsdom-whatwg-url-tr46 = "MIT"
LICENSE_${PN}-browser-env-window-jsdom-whatwg-url-webidl-conversions = "BSD-2-Clause"
LICENSE_${PN}-browser-env-window-jsdom-whatwg-url = "MIT"
LICENSE_${PN}-browser-env-window-jsdom-xml-name-validator = "WTFPL"
LICENSE_${PN}-browser-env-window-jsdom = "MIT"
LICENSE_${PN}-browser-env-window = "MIT"
LICENSE_${PN}-browser-env = "MIT"
LICENSE_${PN} = "Unknown Apache-2.0"
