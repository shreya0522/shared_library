package org.mygurukulam.common

def call(String url , String branch) {
            echo "Cloning repo ${url} from branch ${branch}";
            git branch: "${branch}", url: "${url}"
    }
