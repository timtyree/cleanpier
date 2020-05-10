#!/bin/bash
# initialize cleanlegion python notebook environment
# Programmer: Tim Tyree
# Date: May 9, 2020

#relative paths to cleanlegion.yml and pkgs.txt
export direnvyml = cleanlegion.yml
export dirpkgstxt = pkgs.txt

#create environment from yml file
conda env create --file $direnvyml

#create environment based on exact package versions
conda create --name NEWENV --file $dirpkgstxt