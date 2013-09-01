#!/usr/bin/env bash

set -o nounset
set -o errexit

# only this master project we need the plugins for as the rest will be done
# collectively in the subs
lein deps

# all subprojects auto-upgrade plus clj
lein sub ancient :upgrade

# now pull in most recent releases
lein sub deps
