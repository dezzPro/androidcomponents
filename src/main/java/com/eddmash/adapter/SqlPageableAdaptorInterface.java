package com.eddmash.adapter;
/*
* This file is part of the com.eddmash.adapter package.
* 
* (c) Eddilbert Macharia (http://eddmash.com)<edd.cowan@gmail.com>
*
* For the full copyright and license information, please view the LICENSE
* file that was distributed with this source code.
*/

import com.eddmash.pagination.PaginatorInterface;

interface SqlPageableAdaptorInterface extends SearchableAdaptorInterface{
    void addAll(PaginatorInterface paginator);
}
